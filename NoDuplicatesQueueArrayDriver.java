
public class NoDuplicatesQueueArrayDriver {
		public static void main(String[] args) 
		{
			testQueueOperations();
			System.out.println("\n\nDone.");
		}  // end main

		public static void testQueueOperations()
		{
			System.out.println("Create a queue: ");
			QueueInterface<Integer> myQueue = new NoDuplicatesQueueArray<>();
			System.out.println("\n\nisEmpty() returns " + myQueue.isEmpty() + "\n");
			
			System.out.println("Add to queue to get\n" +
			                   "1 2 3 4 5 6\n");
			myQueue.enqueue(1);
			myQueue.enqueue(2);
			myQueue.enqueue(3);
			myQueue.enqueue(4);
			myQueue.enqueue(5);
			myQueue.enqueue(6);

			System.out.println("\nisEmpty() returns " + myQueue.isEmpty() + "\n");

			System.out.println("\n\nTesting getFront and dequeue:\n");
			while (!myQueue.isEmpty())
			{
				int front = myQueue.getFront();
				System.out.println(front + " is at the front of the queue.");
				
				front = myQueue.dequeue();
				System.out.println(front + " is removed from the front of the queue.\n");
			} // end while

			System.out.print("\nThe queue should be empty: ");
			System.out.println("isEmpty() returns " + myQueue.isEmpty() + "\n\n");

			System.out.println("Add to queue to get\n" +
			                   "7 8\n");
			myQueue.enqueue(7);
			myQueue.enqueue(7);
			myQueue.enqueue(8);
			
			System.out.println("\nTesting clear:\n");
			myQueue.clear();
				
			System.out.println("\nisEmpty() returns " + myQueue.isEmpty() + "\n\n");

			System.out.println("Add to queue to get\n" +
			                   "8 7\n");
			myQueue.enqueue(8);
			myQueue.enqueue(8);
			myQueue.enqueue(7);
			
			while (!myQueue.isEmpty())
			{
				Object front = myQueue.getFront();
				System.out.println(front + " is at the front of the queue.");
				
				front = myQueue.dequeue();
				System.out.println(front + " is removed from the front of the queue.\n");
			} // end while

			System.out.print("\n\nThe queue should be empty: ");
			System.out.println("isEmpty() returns " + myQueue.isEmpty() + "\n");
			
		} // end testQueueOperations
	}  // end Driver


