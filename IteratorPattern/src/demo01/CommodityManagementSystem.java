package demo01;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: weige
 * \* Date: 2020/4/26
 * \* Time: 19:42
 * \* Description: www.diandian.在线
 * \
 */
public class CommodityManagementSystem implements ManagementSystem{

    private Object[] objects={"上衣","裤子","裙子","帽子","手表","鞋子"};
    @Override
    public Iterator creatIterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator{

        private int index=2;
        @Override
        public void next() {
//            for (Object o:objects){
//                System.out.println(objects[index]);
//                index++;
//            }
            if (index<objects.length){
                index++;
            }
        }

        @Override
        public void forward() {
//            for (Object o:objects){
//                System.out.println(objects[index]);
//                index--;
//            }
            if (index<objects.length){
                index--;
            }

        }

        @Override
        public void setItem(int index) {
            this.index=index;
        }

        @Override
        public Object Item() {
            return objects[index];
        }
    }
}