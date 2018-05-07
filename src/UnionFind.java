public class UnionFind {





    public static void main(String[] args) {
        QFLazyApproach qf = new QFLazyApproach(10);
        qf.printSelf();
        qf.union(1,2);
        qf.union(2,4);
        System.out.println(qf.root(1));
        qf.printSelf();



    }
}
