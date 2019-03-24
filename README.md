# Lab2-AndroidLayout
## Description: 
Design three pages with linearlayout, constraintlayout and tablelayout.
## Core code:
```
 //Implement button jump events
 Button btn_toLinearLayout=(Button)findViewById(R.id.btn_toLinearLayout);
        btn_toLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
  }
  //LinearLayout
  <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="#000000"
        >
        <Button
            android:id="@+id/button11"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="@string/v11"
            android:textColor="#C0C0C0"
            android:textAllCaps="false"
            android:background="@xml/shape"
            android:layout_margin="6px"
            />
       <Button ... </>
       <Button ... </>
       <Button ... </>
    </LinearLayout>
  //Three Button in the page using ConstraintLayout
  <Button
        android:id="@+id/btn_blue"
        android:layout_width="70dp"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:layout_below="@id/btn_orange"
        android:layout_marginTop="29dp"
        android:text="@string/blue"
        android:background="#0000FF"
        />
    <Button
        android:id="@+id/btn_green"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_toLeftOf="@id/btn_blue"
        android:layout_below="@id/btn_orange"
        android:layout_marginTop="29dp"
        android:layout_marginRight="10dp"
        android:text="@string/green"
        android:background="#00FF00"
        />
    <Button
        android:id="@+id/btn_indigo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_toRightOf="@id/btn_blue"
        android:layout_below="@id/btn_orange"
        android:layout_marginTop="29dp"
        android:layout_marginLeft="10dp"
        android:text="@string/indigo"
        android:background="#4B0082"
        />
  //TableLayout
      <TableRow>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="22dp"
            android:text="@string/btn_row0"
            android:gravity="left"
            android:paddingLeft="11dp"
            android:background="#000000"
            android:textColor="#808A87"
            android:textAllCaps="false"
            />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/btn_qk0"
            android:paddingLeft="286dp"
            android:textColor="#808A87"
            android:textAllCaps="false"
            />
    </TableRow>
  //hide title
  <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <item name="windowNoTitle">true</item>
    </style>
  ```

## Screenshots:
#### 1.index page<br>
![This picture is stored in the folder of this screenshots.](https://github.com/huhuhuu/Lab2-AndroidLayout/blob/master/screenshots/index.PNG)<br>
#### 2.LinearLayout page<br>
![This picture is stored in the folder of this screenshots.](https://github.com/huhuhuu/Lab2-AndroidLayout/blob/master/screenshots/LinearLayout.PNG)<br>
#### 3.ConstraintLayout page<br>
![This picture is stored in the folder of this screenshots.](https://github.com/huhuhuu/Lab2-AndroidLayout/blob/master/screenshots/ConstraintLayout.PNG)<br>
#### 4.TableLayout page<br>
![This picture is stored in the folder of this screenshots.](https://github.com/huhuhuu/Lab2-AndroidLayout/blob/master/screenshots/TableLayout.PNG)
