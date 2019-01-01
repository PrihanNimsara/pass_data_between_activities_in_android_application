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

- 03  how to pass custome object

```ruby
import android.os.Parcel;
import android.os.Parcelable;

public class Student  implements Parcelable {

    private Integer age;
    private String name;

    public Student() {
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    protected Student(Parcel in) {
        if (in.readByte() == 0) {
            age = null;
        } else {
            age = in.readInt();
        }
        name = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (age == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(age);
        }
        parcel.writeString(name);
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
        Student student = (Student) intent.getParcelableExtra("custom_object");
        Integer age = student.getAge();
        String name = student.getName();
```  

- 04  by use bundle with a intent

> SenderActivity 

```ruby
        Intent intent = new Intent(context,SecondActivity.class);

        Bundle bundle = new Bundle();
        bundle.putInt("age",0);
        bundle.putString("name","prihan");

        intent.putExtras(bundle);
        startActivity(intent);
```

> ReceiverActivity

```ruby
        Bundle bundle = getIntent().getExtras();
        Integer age = bundle.getInt("age");
        String name = bundle.getString("name");
```

- 05  pass custom object with a bundle

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

        Bundle bundle = new Bundle();

        Student student = new Student();
        student.setAge(20);
        student.setName("prihan");

        bundle.putSerializable("custom_object", student);
        intent.putExtras(bundle);
        startActivity(intent);
```

> ReceiverActivity

```ruby
        Bundle bundle = getIntent().getExtras();
        Student student = (Student) bundle.getSerializable("custom_object");
        Integer age = student.getAge();
        String name = student.getName();
```

