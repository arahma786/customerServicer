package c322.homework.homework6.parta;

public interface ProfileIterator extends Iterator{
    boolean hasNext();

    Profile getNext();
    boolean hasMore();

    void reset();
}
