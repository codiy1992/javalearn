package demo.aop;

public class MyService implements ServiceInterface, ServiceInterface2 {

    public String name;

    @Override
    public void sayHello() {
        System.out.println("sayHello: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayBye() {

        System.out.println("sayBye: " + name);
    }
}
