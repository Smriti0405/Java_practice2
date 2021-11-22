public class Exception_check1 {
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("Smriti");
        obj.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj.getId());
        System.out.println(obj.isAlive());
        System.out.println(obj.getPriority());
        System.out.println(obj.isDaemon());
    }
}
