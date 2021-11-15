<html>
    <head>
        <style>
            form{
                background-color: skyblue;
                align-content:center;
                margin:auto;
                margin-top:50px;
                border:2px solid maroon;
                height:200px;
                width:500px;
            }
            label{
                margin:30px;
            }
            .button{
                margin-left:70px;
            }
                h1{
                    margin-top: 40px;
                    margin-left: 500px;
                    color:burlywood;
            }

        </style>
    </head>
    <body>
        <h1>
Student form
    </h1>
        <form action="save" modelAttribute="student">
         <label>student name</label>
            <input type="text" name="name" placeholder="name"><br>
             <label>College name</label>
            <input type="text" name="college" placeholder="college"><br>
             <label>Branch</label>
            <input type="text" name="branch" placeholder="branch"><br>
             <label>Age</label>
            <input type="number"name="age" placeholder="age"><br>
            <button class="button">submit</button>
        </form>
    </body>
</html>