package test;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SurrogatePairChecker {

    static List<Font> fonts = new ArrayList<Font>();

    static {
        // 実行環境内の全フォントを取得
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        for (String name : fontNames)
            fonts.add(Font.decode(name));
    }

    public static void main(String[] args) throws SQLException, IOException {
        // char 2文字分の全範囲を探索
        for (char i = 0; i < 65535; i++) {
            for (char j = 0; j < 65535; j++) {
                // 非サロゲートペアはスキップ
                if (!Character.isSurrogatePair(i, j))
                    continue;

                int codepoint = Character.toCodePoint(i, j);
                // 表示可能なら表示
                if (canDisplay(codepoint))
                    System.out.println(Character.toChars(codepoint));
            }
        }
    }

    // 任意のコードポイントがシステム内のフォントで表示可能かどうか調べる
    private static boolean canDisplay(int codepoint) {
        for (Font font : fonts)
            if (font.canDisplay(codepoint))
                return true;

        return false;
    }

    public static boolean isSurrogate(String str) {

		if ((str == null) || ("".equals(str))) {
			return false;
		}

		for (char c : str.toCharArray()) {
			if (Character.isHighSurrogate(c) || Character.isLowSurrogate(c)) {
				return true;
			}
		}
		return false;
	}

	public static int[] toCodePointArray(String str) {
		int len = str.length(); // the length of str
		int[] acp = new int[str.codePointCount(0, len)];

		for (int i = 0, j = 0; i < len; i = str.offsetByCodePoints(i, 1)) {
			acp[j++] = str.codePointAt(i);
		}
		return acp;
	}

	public static boolean canEncodinf(String str, String enncode) {
		CharsetEncoder charsetEncoder = Charset.forName(enncode).newEncoder();
		return charsetEncoder.canEncode(str);
	}
}
