import java.util.HashMap;

public class password {
    private String websiteName;
    String websiteColor;
    String month;
    String year;
    String petLetter;
    String pet;
    String websiteLetter;
    String randomCharacter;

    public password(String websiteName, String websiteColor, String year, String petName, String randomCharacter){
        this.websiteName = websiteName;
        this.websiteColor = websiteColor;
        this.year = year.substring(2, 4);;
        this.pet = petName;
        this.petLetter = String.valueOf(petName.charAt(0));
        this.websiteLetter = String.valueOf(websiteName.charAt(0));
        this.month = numberToMonth(websiteName.length());
        this.randomCharacter = randomCharacter;
    }


    public String numberToMonth(int number){
        HashMap<Integer, String> numberMonth = new HashMap<Integer, String>();
        numberMonth.put(1, "Jan");
        numberMonth.put(2, "Feb");
        numberMonth.put(3, "Mar");
        numberMonth.put(4, "Apr");
        numberMonth.put(5, "May");
        numberMonth.put(6, "Jun");
        numberMonth.put(7, "Jul");
        numberMonth.put(8, "Aug");
        numberMonth.put(9, "Sep");
        numberMonth.put(10, "Oct");
        numberMonth.put(11, "Nov");
        numberMonth.put(12, "Dec");
        if (number > 12) {
            while (number > 12) {
                number -= 12;
            }
        }
        return numberMonth.get(number);
    }

    public String getWebsiteColor() {
        return websiteColor;
    }

    public String getPetLetter() {
        return petLetter;
    }

    public String getYear() {
        return year;
    }

    public String getWebsiteLetter() {
        return websiteLetter;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return websiteLetter + year + randomCharacter + month + websiteName.length() + petLetter + websiteColor;
    }
}

