College Management System -  

Design a system for a college to efficiently manage information about students, professors, and courses:
Store comprehensive profiles for every student, capturing their first name, last name, sex, age, date of birth, CNP, and address.
Similarly, maintain detailed profiles for every professor, including their first name, last name, sex, age, date of birth, CNP, and address.
The college offers eight distinct courses: Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History. For each course, track details like its schedule, duration, description, and the assigned professor.
Allow for the assignment of a professor to a specific course and ensure the ability to retrieve and view course details, including its assigned professor.

Designing a College Management System involves creating a database schema and defining functionalities to efficiently manage information about students, 
professors, and courses. Below is a high-level description of the system's components and functionalities:

Person Class:

Attributes: firstName, lastName, sex, age, dateOfBirth, CNP, address
Methods: getters and setters for attributes
Student Class (extends Person):

Constructor: Inherits attributes from Person
Additional Methods: None (inherits methods from Person)
Professor Class (extends Person):

Constructor: Inherits attributes from Person
Additional Methods: None (inherits methods from Person)
Course Class:

Attributes: name, schedule, duration, description, assignedProfessor
Methods: getters and setters for attributes
CollegeManagementSystem Class:

Attributes: Lists of students, professors, courses
Constructor: Initializes empty lists
Methods:
addStudent(Student student): Adds a student to the list
addProfessor(Professor professor): Adds a professor to the list
addCourse(Course course): Adds a course to the list
getCourseDetails(String courseName): Retrieves course details by name