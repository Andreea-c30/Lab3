Laboratory work 3 Description

Working on this laboratory has allowed me to become acquainted with the oop concept inheritance, as well as how to implement it and why it is important. Inheritance involves having superclases and the classes that derive from them. The child class will inherit all the public and protected properties and methods from the parent class.

The scope of this laboratory is to create a chain of classes that inherit from one another. Therefore, I created a root class from which all the other classes will be connected to and will inherit its methods, some of which will override them.

In order to better understand the process, I created a diagram, which seems a lot like a tree, and in which the relationships between the classes can be observed extremely well.

First and foremost, the Admision, Employees, and Departments are derived from the root class. Employees was not an original class from the previous laboratory, but I created it as an intermediary class to connect the classes Professor and Administration, which contain similar information. So it is more convenient to derive those two classes from the Employees class. In this class we have information that will help to calculate the salary of an employee. The administration will inherit the method, but for the professors we will have a different way to calculate the salary. Therefore, I override the method salary().

Next, talking about the admission branch, I made it a superclass for the students' class because in every university or college, each student has been admitted before he is enrolled. Also, in the future, maybe it will be needed to call some methods from the Admission class. From the student, I derived two classes: Exams and Grades, because they are related to the student and we need the student ID from the student class to get information about student grades or the exams.
Next, talking about the admission branch, I made it a superclass for the students' class because in every university or college, each student has been admitted before he is enrolled. Also, in the future, maybe it will be needed to call some methods from the Admission class. From the student, I derived two classes: Exams and Grades, because they are related to the student and we need the student ID from the student class to get information about student grades or the exams.

The last branch that inherits the behavior from the root class is Departments, from which I derived Groups, because at every institution, the groups of students are categorized by departments and inherit information from them. Also from Departments, I created the class Objects, because each department includes a specific program that follows and the object studied will depend on the department it is in.


The last relationship is the class Schedule that inherits data from the Groups. This happens because the schedule of classes is connected directly to the group of students, and it can inherit important data from them.

All things considered, all the classes connected to each other create a system and show how exactly the insitution works, and it is easier to use inherintance than to declare the same methods over and over again.

















