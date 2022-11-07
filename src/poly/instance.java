package poly;

public class instance {
    // instanceOf 比较操作符，用于判断对象的与运行类型是否为XX 类型或 XX 类型的子类型
    BB bb = new BB();
    Object obj2 = null;
    public void test(){
        System.out.println( bb instanceof AA); //true
        System.out.println( obj2 instanceof AA);//false
    };

}

class AA { }
class BB extends  AA {}
