package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Consumer<Integer> consumer = i -> System.out.print(" " + i + " ");
		Consumer<Integer> consumerWithAndThen = consumer
				.andThen(i -> System.out.println(" (Number: " + i + " was printed) "));
		printList(list, consumerWithAndThen);

	}

	private static void printList(List<Integer> list, Consumer<Integer> consumer) {
		for (Integer integer : list) {
			consumer.accept(integer);
		}

	}

}
