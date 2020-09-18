package blinovtask.inner.anonymous;
/*- анонимный класс - позаоляет избавится от ненужного наследлвания, т е чтобы не создавать классы наследники
* и интерфейсыдл для малого количества childClasses */
public class MainService {
    public static void main(String[] args) {

        Service service = new Service() {// Service service = new Service() {} - анонимный класс -

            @Override
            public void service1() {
                System.out.println("anon serv 1");
            }

            @Override
            public void service2() {
                System.out.println("anon serv 1");
            }
        };
        service.service1();
        service.service2();
    }
}
//output:
// serv 1
// anon serv 1
// anonymus classes не бывает для final classes and methods