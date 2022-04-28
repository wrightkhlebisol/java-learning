public class GenericList<T extends Number> {
  private T[] items = new T[10];
  private int count;

  public void add(T item) {
    items[count++] = item;
  }

  public T get(int index) {
    return items[index];
  }
}
