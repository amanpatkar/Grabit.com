<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
     
    </head>
    <style> 
    
      body {
        background-image:url('images/Bg1.jpg');
        background-size: cover;
        /background-color:#659DBD;/
      }
      .abc{
    width: 40%;
    margin-left: 30%;
}
      .abcd{
          margin-right: 20%;
          margin-left:20%;
          margin-top: 20px;
      }
  </style>
    
    <body>
        <div class="container">
            <div class="jumbotron abcd">
            <h2 class="text-center"> Registration form </h2>
            <form action="" class="needs-validation" nonvalidate> 
                <div class="form-group abc">
                <label for="Fname">Name:</label>
                <input type="text" class="form-control" placeholder="Enter Name" name="Fname" required>
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>
            <div class="form-group abc">
            <label for="gender">Gender:</label>
    <input type="radio" name="gender" value="male" checked> Male
    <input type="radio" name="gender" value="female"> Female
    <input type="radio" name="gender" value="other"> Other
            </div>
    <div class="form-group abc">
            <label for="No">Number:</label>
            <input type="Number" class="form-control" placeholder="Enter Number" name="No" required>
            <div class="valid-feedback"></div>
            <div class="invalid-feedback"></div>
        
        </div>
        <div class="form-group abc">
                <label for="DOB">DOB:</label>
        <input type="date"class="form-control" name="DOB">
        <div class="valid-feedback"></div>
        <div class="invalid-feedback"></div>
    </div>
        <div class="form-group abc">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
              </div>
              <div class="form-group abc">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
              </div>
              <div class="form-group abc">
                    <label for="Brand_name">Brand_name:</label>
                    <input type="text" class="form-control" placeholder="Enter brand_name" name="Brand_name">
                    <div class="valid-feedback"></div>
                    <div class="invalid-feedback"></div>
                  </div>
                  <div class="form-group abc">
                        <label for="location">location:</label>     
                        <textarea class="form-control" rows="2" id="comment" name="location"></textarea>
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback"></div>
                      </div>
                  <button type="submit" class="btn btn-primary abc">Register</button>
                      
                         
            </form>
          </div>
      </div>
      </body>
      </html>