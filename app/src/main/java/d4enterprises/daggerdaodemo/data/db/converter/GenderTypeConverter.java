package d4enterprises.daggerdaodemo.data.db.converter;

import org.greenrobot.greendao.converter.PropertyConverter;

import d4enterprises.daggerdaodemo.enums.Gender;

/**
 * Created by dakshgargas
 */

public class GenderTypeConverter implements PropertyConverter<Gender, String> {
    @Override
    public Gender convertToEntityProperty(String databaseValue) {
        return Gender.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(Gender entityProperty) {
        return entityProperty.name();
    }
}
