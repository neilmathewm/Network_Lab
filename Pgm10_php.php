
<?php
$xml=simplexml_load_file("Pgm10_stud_xml.xml") or die("Error: Cannot create object");
//echo $xml->student[0]->name . "<br>";
?>

<style>
	table,td,th{border:1px solid;}
</style>
<center>
<!-- Table to print all students list -->
<table style="width:50%">
<tr>
	<th colspan="5">List of Students</th>
</tr>
<tr>
<th>Roll</th>
<th>Name</th>
<th>Age</th>
<th>Marks</th>
<th>Company</th>
</tr>

<?php
foreach($xml->children() as $stud) { 
  ?>
  <tr>
    <td><?php echo $stud->roll;?></td>
    <td><?php echo $stud->name;?></td>
    <td><?php echo $stud->age;?></td>
    <td><?php echo $stud->marks;?></td>
    <td><?php echo $stud->company;?></td> 
   </tr>
<?php
} 
?>
</table>
<br><br>
<!-- Table to print all students placed -->
<table style="width:50%">
<tr>
	<th colspan="5">List of Placed Students</th>
</tr>
<tr>
<th>Roll</th>
<th>Name</th>
<th>Company</th>
</tr>

<?php
foreach($xml->children() as $stud) { 
  if($stud->company!='')
  	{ 
  ?>
  <tr>
    <td><?php echo $stud->roll;?></td>
    <td><?php echo $stud->name;?></td>
    <td><?php echo $stud->company;?></td> 
   </tr>
<?php
	}
} 
?>
</table>
<br><br>
<!-- Table to print Class topper -->
<table style="width:50%">
<tr>
	<th colspan="5">Class Topper</th>
</tr>
<tr>
<th>Roll</th>
<th>Name</th>
<th>Marks</th>
</tr>

<?php
$ar=array();

foreach($xml->children() as $stud) {
	array_push($ar, (int)$stud->marks);
	}
rsort($ar);//reverse sort
$max= $ar[0];
foreach($xml->children() as $stud) {
  if($stud->marks==$max){ 
  ?>
  <tr>
    <td><?php echo $stud->roll;?></td>
    <td><?php echo $stud->name;?></td>
    <td><?php echo $stud->marks;?></td> 
   </tr>
<?php
	}
} 
?>
</table>
<br><br>
<!-- Table to print Rank list -->
<table style="width:50%">
<tr>
	<th colspan="5">Rank List</th>
</tr>
<tr>
<th>Rank</th>
<th>Roll</th>
<th>Name</th>
<th>Marks</th>
</tr>

<?php
$len= count($ar);
for($i=0;$i<$len;$i++)
foreach($xml->children() as $stud) {
  if($stud->marks==$ar[$i]){ 
  ?>
  <tr>
  	<td><?php echo $i+1;?></td>
    <td><?php echo $stud->roll;?></td>
    <td><?php echo $stud->name;?></td>
    <td><?php echo $stud->marks;?></td> 
   </tr>
<?php
	}
} 
?>
</table>
</center>