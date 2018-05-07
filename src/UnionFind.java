public class UnionFind {





    public static void main(String[] args) {
        QFWeighted qf = new QFWeighted(10);
        qf.printSelf();
        qf.union(1,2);


        qf.union(2,4);
        qf.union(4,7);
        qf.union(5,6);
        qf.union(1,5);



        System.out.println(qf.root(1));
        qf.printSelf();



    }
}
