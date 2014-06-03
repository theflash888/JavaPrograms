<?php

   define('DB_NAME', 'test');
   define('DB_USER', 'root');
   define('DB_PASSWORD', '');
   define('DB_HOST', 'localhost');
   
   $link = mysql_connect(DB_HOST, DB_USER, DB_PASSWORD);
   
   if(!$link)
   {
   		die('Could not connect: ' . mysql_error());
   }
   
   $db_selected = mysql_select_db(DB_NAME, $link);
   
   if(!$db_selected)
   {
   		die('Can\'t use ' . DB_NAME . ': ' . 	mysql_error());
   }
   
   //echo "Connected successfully";
   
   $value = $_POST['input1'];
   $value2 = $_POST['input2'];
   $value3 = $_POST['input3'];
   
   $sql = "INSERT INTO demo (input1, input2, input3) VALUES ('$value', '$value2', '$value3')";
   
   if(!mysql_query($sql))
   {
   		die('Error: ' . mysql_error());
   }
   
   mysql_close();
?>




