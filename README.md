# Pass Data Between Activities in Android Application (by using Intent)

###### How do I pass data between Activities in Android application?

- 01

> SenderActivity 

```ruby
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("age",20);
        intent.putExtra("name","prihan");
        startActivity(intent);
```

> ReceiverActivity

```ruby
        Intent intent = getIntent();
        Integer age = intent.getIntExtra("age",0);
        String name = intent.getStringExtra("name");
```       

- 02  how to pass custome object

```ruby
import java.io.Serializable;

public class Student  implements Serializable {

    private Integer age;
    private String name;

    public Student() {
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

> SenderActivity 

```ruby
        Intent intent = new Intent(context,SecondActivity.class);

        Student student = new Student();
        student.setAge(20);
        student.setName("prihan");

        intent.putExtra("custom_object",student);
        startActivity(intent);
```

> ReceiverActivity

```ruby
        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("custom_object");
        Integer age = student.getAge();
        String name = student.getName();
```  
