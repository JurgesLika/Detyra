public class WeekDays {
    public enum Weekday{
        MONDAY(true,false),
        TUESDAY(true,false),
        WEDNESDAY(true,false),
        THURSDAY(true,false),
        FRIDAY(true,false),
        SATURDAY(false,true),
        SUNDAY(false,true);
        private final boolean isWeekDay;
        private final boolean isHoliday;
        Weekday(boolean isWeekDay,boolean isHoliday){
            this.isWeekDay=isWeekDay;
            this.isHoliday=isHoliday;
        }
        public boolean isWeekDay(){
            return isWeekDay;
        }

        public boolean isHoliday() {
            return isHoliday;
        }
        //Metoda per te krahasuar
        public String whichIsGreater(Weekday otherDay) {
            int comparisonResult = this.compareTo(otherDay);
            if (comparisonResult < 0) {
                return this + " është pararendësja e " + otherDay;
            } else if (comparisonResult > 0) {
                return this + " është pasardhësja e " + otherDay;
            } else {
                return this + " është e njëjtë me " + otherDay;
            }
        }
    }

    public static void main(String[] args) {
        Weekday ditaEHenë = Weekday.MONDAY;
        Weekday ditaEMërkurë = Weekday.WEDNESDAY;
        Weekday ditaEEnjte = Weekday.THURSDAY;

        System.out.println(ditaEHenë + " është ditë e javës: " + ditaEHenë.isWeekDay() + ", është pushim: " + ditaEHenë.isHoliday());
        System.out.println(ditaEMërkurë + " është ditë e javës: " + ditaEMërkurë.isWeekDay() + ", është pushim: " + ditaEMërkurë.isHoliday());

        // Shembulli i metodës whichIsGreater
        System.out.println(ditaEHenë.whichIsGreater(ditaEMërkurë));
        System.out.println(ditaEEnjte.whichIsGreater(ditaEHenë));
    }

}
