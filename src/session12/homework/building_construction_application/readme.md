Create class design (classes, interfaces, fields, whatever you need) to build the OOP concept of an application that can
be used by the constructor engineer and project manager to track the construction of a building, from start to finish,
with following requirements:
Roles
Admin - can bring changes to the application
User - manager or constructor engineer who can observe the progress of the construction or interact with the data
The manager can see all company’s employee, available construction resources and needed resources
The application should take into account the fact that all the employees are working in teams, and each team has a
leader; The manager should be able to see each team structure (members and team lead) and he should be able to change
the team structure
The manager can change employee position (from team member to team lead)
The application should be able to send emails to the employees with company announcements

To design an object-oriented application that meets the requirements for tracking the construction of a building, we can
create the following classes and interfaces:

User (Interface):

viewProgress(): A method to view the progress of construction.
interactWithData(): A method to interact with the data.
viewCompanyEmployees(): A method to view all company employees.
viewAvailableResources(): A method to view available construction resources.
viewNeededResources(): A method to view needed resources.
viewTeamStructure(): A method to view the structure of a team.
changeTeamStructure(): A method to change the team structure.
changeEmployeePosition(): A method to change an employee's position.
sendAnnouncement(String announcement): A method to send company announcements via email.
Admin (Class):

User interface should be implemented.
bringChangesToApplication(): A method to bring changes to the application.
Employee (Class):

User interface should be implemented.
Fields:
name: Name of the employee.
email: Email address of the employee.
position: Current position (e.g., manager, constructor engineer).
team: The team to which the employee belongs.
joinTeam(Team team): A method to assign an employee to a team.
leaveTeam(): A method to remove an employee from a team.
Team (Class):

Fields:
teamLead: The leader of the team.
members: A list of team members.
addMember(Employee member): A method to add a member to the team.
removeMember(Employee member): A method to remove a member from the team.
changeTeamLead(Employee newTeamLead): A method to change the team leader.
ConstructionResource (Class):

Fields:
resourceName: Name of the construction resource.
quantity: Quantity of the resource available.
BuildingConstructionApplication (Class):

Fields:
admins: A list of admin users.
users: A list of user accounts (managers and constructor engineers).
employees: A list of all employees.
resources: A list of available construction resources.
neededResources: A list of needed resources.
teams: A list of construction teams.
addAdmin(Admin admin): A method to add an admin to the application.
addUser(User user): A method to add a user to the application.
addEmployee(Employee employee): A method to add an employee to the application.
addResource(ConstructionResource resource): A method to add a construction resource.
addNeededResource(ConstructionResource resource): A method to add a needed resource.
createTeam(Employee teamLead, List<Employee> members): A method to create a construction team.
removeTeam(Team team): A method to remove a construction team.
announce(String announcement): A method to send company announcements to all employees.
With this class design, you can create instances of employees, teams, resources, and users within your construction
application. Admins have the authority to make changes to the application, and users (managers and constructor
engineers) can interact with the data and perform various tasks related to tracking the construction progress.