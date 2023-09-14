package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	
	public int change(int number) {
		return number - 48;
	}
	
	public static void main(String[] args) {
//		10~1���� ArrayList�� ��� ���
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(0, 9).forEach(data -> datas.add(10 - data));
//		System.out.println(datas);
		
//		1~10���� ArrayList�� ��� ���
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
		
//		ABCDEF�� �� ���ں��� ���
//		"ABCDEF".chars().forEach(c -> System.out.print((char)c));
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.print((char)c));
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//		System.out.println(datas);
		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));
		
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		IntStream.range(1, 101).filter(data -> data % 2 != 0).forEach(datas::add);
//		System.out.println(datas);
		
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
		datas.stream()
			.filter(data -> data.charAt(0) >= 'A')
				.filter(data -> data.charAt(0) <= 'Z')
					.forEach(System.out::println);
		
//		�ѱ��� ������ ����
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String data = "�ϰ��̻�";
//		data.chars().map(hangle::indexOf).forEach(System.out::print);
				
//		������ �ѱ۷� ����
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String data = "1024";
//		StreamTask streamTask = new StreamTask();
//		data.chars().map(streamTask::change).forEach(i -> System.out.print(hangle.charAt(i)));
	}
}





















