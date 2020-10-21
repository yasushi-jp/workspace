package jp.co.test;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ClassFinder {

	private ClassLoader classLoader = null;

	public ClassFinder() {
		classLoader = Thread.currentThread().getContextClassLoader();
	}

	public List<Class<?>> getClasses(String rootPackageName) throws ClassNotFoundException, IOException {

		String resourceName = rootPackageName.replace('.', '/');

        URL url = classLoader.getResource(resourceName);

        if (url == null) {
            return new ArrayList<Class<?>>();
        }

        String protocol = url.getProtocol();
        if ("file".equals(protocol)) {
            return getClassesWithFile(rootPackageName, new File(url.getFile()));
        } else if ("jar".equals(protocol)) {
            return getClassesWithJarFile(rootPackageName, url);
        } else {
            throw new IllegalArgumentException("Unsupported Class Load Protodol[" + protocol + "]");
        }
	}

    private List<Class<?>> getClassesWithFile(String packageName, File dir) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();

        for (String path : dir.list()) {
            File entry = new File(dir, path);
            if (entry.isFile() && entry.getName().endsWith(".class")) {
                classes.add(classLoader.loadClass(packageName + "." + entry.getName().substring(0, entry.getName().length() - ".class".length())));
            } else if (entry.isDirectory()) {
                classes.addAll(getClassesWithFile(packageName + "." + entry.getName(), entry));
            }
        }

        return classes;
    }

    private List<Class<?>> getClassesWithJarFile(String rootPackageName, URL jarFileUrl) throws IOException, ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();

        JarURLConnection jarUrlConnection = (JarURLConnection)jarFileUrl.openConnection();
        JarFile jarFile = null;

        try {
            jarFile = jarUrlConnection.getJarFile();
            Enumeration<JarEntry> jarEnum = jarFile.entries();

            String packageNameAsResourceName = rootPackageName.replace('.', '/');

            while (jarEnum.hasMoreElements()) {
                JarEntry jarEntry = jarEnum.nextElement();
                if (jarEntry.getName().startsWith(packageNameAsResourceName) && jarEntry.getName().endsWith(".class")) {
                    classes.add(classLoader.loadClass(jarEntry.getName().replace('/', '.')));
                }
            }
        } finally {
            if (jarFile != null) {
                jarFile.close();
            }
        }

        return classes;
    }

}
