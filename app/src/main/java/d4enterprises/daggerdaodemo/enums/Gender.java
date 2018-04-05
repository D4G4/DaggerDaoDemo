package d4enterprises.daggerdaodemo.enums;

/**
 * Created by dakshgargas
 * <p>
 * This enum are used to show the usage of custom
 * {@link org.greenrobot.greendao.converter.PropertyConverter}
 * thats it.
 */

public enum Gender {
    MALE(0),
    FEMALE(1);

    int val;

    Gender(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public static Gender getEnum(int val) {
        switch (val) {
            default:
                return MALE;
            case 1:
                return FEMALE;
        }
    }
}
