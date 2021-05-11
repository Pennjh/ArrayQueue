
public final class NoDuplicatesQueueArray<T> implements NoDuplicatesQueueInterface<T> {

	//=================================================== Parameters
	private T[] q;
	private static final int DEFAULT_CAPACITY = 7; // Small capacity for testing
	private static final int MAX_CAPACITY = 10000;
	int rear, front, size;
	
	//=================================================== Constructors
	public NoDuplicatesQueueArray()
	{
		this(DEFAULT_CAPACITY);
	} // end default constructor
	
	public NoDuplicatesQueueArray(int initialCapacity)
	{
		// To Do:
		q = (T[]) new Object[initialCapacity];
		int size = initialCapacity;
		int front = 0;
		int rear = 0;
		
	}
	//=================================================== Methods
	@Override
	public void enqueue(T newEntry) {
		boolean t = false;
		for (int i = 0; i < size; i++) {
			if(newEntry == q[i])
				t = true;
		}
		if (!(t)) {
		q[rear++] = newEntry;
		if (rear == q.length)
			rear = 0;
		size++;
		}
	}

	@Override
	public T dequeue() {
		T f = null;
		if (!(isEmpty())) {
			f = q[front];
			front = (front + 1) % q.length;
		}
		size--;
		return f;
	}

	@Override
	public T getFront() {
		if (isEmpty())
		return null;
		return q[front];
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < size; i++) {
			q[i] = null;
		}
		size = 0;
		
	}

}
