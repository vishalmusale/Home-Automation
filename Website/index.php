<!DOCTYPE html>
<html>
 <head>
 <meta name="viewport" content="width=device-width" />
 <title>LED Control</title>
 <link href = "css/style.css" rel = "stylesheet">
 </head>
         <body>
         LED Control:
         <form method="get" action="index.php">
		
                 <input type="submit" class="myButton b1" value="ON" name="on" top:50%;>
                 <input type="submit" class="myButton b2" value="OFF" name="off">
         </form>
         <?php
         $setmode17 = shell_exec("/usr/local/bin/gpio -g mode 17 out");
         if(isset($_GET['on'])){
                 $gpio_on = shell_exec("/usr/local/bin/gpio -g write 17 1");
                 echo "LED is on";
         }
         else if(isset($_GET['off'])){
                 $gpio_off = shell_exec("/usr/local/bin/gpio -g write 17 0");
                 echo "LED is off";
         }
         ?>
         </body>
</html>