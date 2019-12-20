package 第六章;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class E6_38 {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("张晓珣","王荟","谭冲","田松源"); 
		Stream<String>parallelStream=list.parallelStream();
		System.out.println(parallelStream.isParallel());
		Stream<String>stream=Stream.of("张晓珣","王荟","谭冲","田松源");
		Stream<String>parallel=stream.parallel();
		System.out.println(parallel.isParallel());
		
	}
}
