package sample;

import java.util.ArrayList;
import java.util.List;

@Info("SampleClass1 Info")
public class SampleClass1 {

	private List list;

	public SampleClass1(){

	}

	@Override
	public boolean equals(Object obj){
		return list.equals(obj);
	}

	@Info("hogehoge")
	public void initList(){
		list = new ArrayList();
		list.add(10);
	}

}