package day10Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NumCountStream {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList();
	
        Stream<Integer>s = Stream.of(1,2,3,4,5,6,7);
		long count = s.count();
		System.out.println(count);
	}

}
