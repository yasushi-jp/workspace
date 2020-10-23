package sample;

@Info("Sample2 class")
public class SampleClass2 {

	@Info("foo field")
	private Foo foo;

	@Info("default constract")
	public SampleClass2() {
		foo = new Foo();
	}

	@Info("bar method")
	public void bar() {
		foo.bar();
	}

}