DaggerDaoDemo 
    -developement steps

GRADLE DEPENDENCIES:

#For Dagger
	compile "com.google.dagger:dagger:2.8"
	provided 'javax.annotation:jsr250-api:1.0'
	compile 'javax.inject:javax.inject:1'
	annotationProcessor "com.google.dagger:dagger-compiler:2.8"
    
Note:We are using the annotation processor provided by gradle for android.
Dagger-compiler is the annotation processing repo for generating the dependency graph classes during build time.

#For GreenDao
    compile 'org.greenrobot:greendao:3.2.2'
    
    //For database encryption
    compile 'net.zetetic:android-database-sqlcipher:3.5.7'
    
CREATE PACKAGES:
    data -> model,converter
    di   -> component, module
   
CREATE CUSOM ANNOTATIONS:
    1. @interface ActivityContext.java         -> @Quantifier
    2. @interface AppContext.java              -> @Quantifier
    3. @interface DatabaseInfo.java            -> @Quantifier 
    4. @interface PerActivity.java             -> @Scope
    
    @Quantifier is used to distinguish b/w the objects of same type but with different instances
    @Scope -> If a class getting dependencies, have MEMBERS INJECTED with classes annotated with scope,
              then each instance of that class asking for dependencies will get it's OWN SET OF member variables.
    @interface is used instead of normal 'interface'. This tells dagger that the current class is a custom annotation.           
    

CREATE ENUM:
    We are creating a java ENUM of Genders to show the usage of custom
    org.greenrobot.greendao.converter.PropertyConverter
    thats it.
    
    But what are PropertyConverter?
    Well to add support for a custom type, you can map them to one of the supported types 
    using a @Convert annotation. 
    You also need to provide a PropertyConverter implementation.
    
    For example: 
    You could define a color in your entity using a custom Color class and map it to an Integer. 
    Or you can map the popular org.joda.time.DateTime from Joda Time to a Long.

CREATE DATABASE CLASS:
    

    
