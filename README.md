# Pass Data Between Activities in Android Application

###### How do I pass data between Activities in Android application?

- step one

> SenderActivity

```ruby
Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
intent.putExtra("age",12);
intent.putExtra("name","prihan");

Student student = new Student();
student.setAge(12);
student.setName("nimal");

startActivity(intent);
```

> ReceiverActivity

```ruby
Intent intent = getIntent();

Student student = (Student)intent.getParcelableExtra("obj");
Integer age = intent.getIntExtra("age",0);
String name = intent.getStringExtra("name");
```

- step two


