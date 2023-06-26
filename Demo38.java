class A {
    int ss = 0;
    int mm = 0;
    int hh = 0;

    public void abc() {
        try {
            for (int i = 0; i <= 60; i++) {
                // System.out.println(hh + ":" + mm + ":" + i);
                System.out.printf("hours %d: minutes %d: seconds %d: ", hh, mm, i);
                if (i == 60) {
                    mm++;
                    i = 0;
                }
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
        }
    }
}

class Demo38 {
    public static void main(String args[]) {
        A a = new A();

        a.abc();
    }
}