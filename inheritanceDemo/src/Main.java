public class Main {
    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        FarmCreditManager farmCreditManager = new FarmCreditManager();
        CreditUI creditUI = new CreditUI();

        teacherCreditManager.calculate();
        farmCreditManager.calculate();
        creditUI.calculateCredit(teacherCreditManager);
    }
}
