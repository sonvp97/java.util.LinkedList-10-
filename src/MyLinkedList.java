import org.w3c.dom.Node;

import java.util.Arrays;

public class MyLinkedList<E> {
    private int numNodes = 0;
    private Node head;
    private int size = 0;
    Object elements[];
    public MyLinkedList(){};
    public void add (int index , E element){
        elements[index] = element;
        size++;
    }
    public void addFirst(E element){
        elements[0] = element;
        size++;
    }
    public void addLast(E element){
        elements[elements.length-1] = element;
        size++;
    }
    public E remove(int index){
        Object[] temp = new Object[elements.length + 1];
        for (int i = 0;i<elements.length;i++){
            if(i<index) temp[i] = elements[i];
            if(i>index) temp[i-1] = elements[i];
        }
        return (E) (elements = Arrays.copyOf(temp,elements.length));
    }
    public  boolean remove(Object o){
        Object[] temp = new Object[elements.length + 1];
        for (Object objects : elements){
            if(objects == o) objects = null;
            return true;
        }
        return false;
    }
    public E clone(){
        Object clone[];
        return (E) (clone = Arrays.copyOf(elements,elements.length/2));
    }
    public boolean contains(E o){
        for (Object object : elements){
            if (object == o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (Object object : elements){
            int i = 0;
            i++;
            if (object == o){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e){
        if (size>=0&&size<elements.length){
            elements[elements.length-1] = e;
            size++;
            return true;
        }
        return false;
    }
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int i){
        if (i>=0&& i<elements.length){
            return (E) elements[i];
        }
        return null;
    }
    public E getFirst(int i){
        if (i>=0&& i<elements.length){
            return (E) elements[0];
        }
        return null;
    }
    public E getLast(int i){
        if (i>=0&& i<elements.length){
            return (E) elements[elements.length - 1];
        }
        return null;
    }
    public void clear(){
        for (int i = 0 ; i<elements.length;i++){
            elements[i] = null;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "numNodes=" + numNodes +
                ", head=" + head +
                ", size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
