# movies-review-web-app

#For Front end https://github.com/tlkbsnt/movie-reviews-web-app.git
# for authentication of login react-auth-jwt-movies-reviews.   in repository https://github.com/tlkbsnt/epita2022fall-web-react-learing.git

instruction for execute
-----------------------
before execute it create the database in postgres 
database name : moviesdb
Table will create automatically by Hibernate
#This is for mongodb learnig
https://share.vidyard.com/watch/uswnzRiiTzVimrLzrBPL83?




-----Installation process------
Before install the mongoldb/brew ( need to install the the Xcode) .ie cmd-   xcode-select --install 
Or install by App Store.

brew tap mongodb/brew
brew update


brew --prefix


brew services start mongodb-community@6.0
brew services stop mongodb-community@6.0
> mongosh // Start mongodb-community on terminal

we can also create the mongodb database from the command line;
command are:
(> mongo  // this is for start mongodb-community)

> show dbs // Display the database 

> exit // Exit mongodb-community
> mongo -u AdminSammy -p --authenticationDatabase admin
    -u: this flag sets the username used to authenticate into the MongoDB server. This example specifies the administrative user created in the prerequisite MongoDB security tutorial, AdminSammy. For this tutorial, you can replace this with your own administrative user’s username if different.
    -p: this flag tells the MongoDB shell to use a password when connecting to the database. You will be prompted to provide a password in the terminal window after you press ENTER.
    --authenticationDatabase: this option specifies the authentication database of the user you’re logging in as. Typically, administrative accounts are managed in the admin database, but if your user’s authentication database is different, enter that database in place of admin.

    > db 
    > use fruits // select the database
    
  1.  How to insert data in mongodb database?
    > db.insertOne({ name: "Tilak", age: "32", }) // insert the single data 
    > db.insertMany([{ name: "Tilak", age: "32"}, { name: "Atikshaya", age: "2"}]) // insert the many data at a time

  2. How to find the data from the mongodb database?
    > db.users.find() // find the data from the mongodb database contain in user tables
    > db.users.find().limit(2) // find onliy txo data form the mongodb database contain in  tables.
    > db.users.find().sort({ name: 1}).limit(2) // find onliy
    > db.users.find().sort({ name: -1}).limit(2) // find data from the reverse of 2 names from the tables.
    > db.users.find().sort({ age: 1, name : -1}).limit(2) // find the data from the reverse 

    > db.users.find().sort({ name : "Tilak"})  // find the specific name in the tables. that is " Tilak".
    > db.users.find().find({ age: 26)} // find the specific age
    > db.users.find({ name: "Tilak", age: 26, id:0}) // find the specific name in the tables. but do not give the id.
        * Note: if the value field is 0  it means that the do not feach the value of tha field.
      
    
    > db.users.find().find({ name: { $eq: "Tilak"}}) // find details of the tilak is if contained in the database.
    > db.users.find({ name: { $ne: "Tilak"}}) // Acepte tilak
    > db.users.find({ name: { $in: ["Tilak", "Atikshaya"]}}) // retrun the details values Tilak and Atikshaya.
    > db.users.find({ name: { $nin: ["Tilak"]}}) // retrun the details values accept Tilak
    > db.users.find({ age: { $exists: true }}) // retrun only the details value of exists of age
    > db.users.find({ age: { $exists: false }}) // retrun only the details value of does not exists of age


    > db.users.find({ age: { $gte: 20, $lte: 40 }}) // retrun data between 20 and 40 age.
    > db.users.find({ age: { $lte: 20}}) // retrun data less than 20

    > db.users.find({ age: {$not :{$lte: 20}}})
