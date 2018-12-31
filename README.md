# Pass Data Between Activities in Android Application

###### How do I pass data between Activities in Android application?

- step one

> Pardon my French


'''
Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
intent.putExtra("age",12);
intent.putExtra("name","prihan");
startActivity(intent);
'''

