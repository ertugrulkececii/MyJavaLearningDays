

    public class Static04 {

       int num1 = 12;

        static int num2 = 22;

        public static void main(String[] args) {

            Static04 obj = new Static04();

            obj.artirma();
         Static04 obj1= new Static04();
            obj1.artirma();

        }

        public void artirma() {

            num1++;

            System.out.println(num1);

        }

    }

