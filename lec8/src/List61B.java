// 接口文件的方法不需要加public
public interface List61B<Item> {
    void addLast(Item x);

    void addFirst(Item x);

    Item getLast();

    Item getFirst();

    Item get(int i);

    int size();

    Item removeLast();

    void Insert(Item x, int position);

}