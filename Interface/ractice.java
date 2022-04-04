package Interface;

public class ractice {

    interface parent{
        void square(Integer n);
    }
    class sprime implements parent{
        public void square(Integer n){
            System.out.print(n*n);
        }
    }

}
