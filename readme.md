# Animals - Find me if you can

This is the demo I modified:

![demo_modified](https://github.com/lining9717/game-animals/blob/huixiaoyang/display/demo_modified.gif?raw=true)

- First，I modified the layout:

  activity_play.xml:

  ```
   <LinearLayout
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          android:layout_marginBottom="10dp"
          android:orientation="vertical"
          android:weightSum="3"
          >

          <RelativeLayout
              android:layout_width="match_parent"
              android:layout_height="0dp"
              android:layout_weight="0.3"
              android:gravity="center_vertical">

              <TextView
                  android:id="@+id/tv_score"
                  android:layout_width="wrap_content"
                  android:layout_height="wrap_content"
                  android:layout_alignParentEnd="true"
                  android:layout_alignParentRight="true"
                  android:layout_centerVertical="true"
                  android:layout_marginEnd="84dp"
                  android:layout_marginRight="84dp"
                  android:text="SCORE:"
                  android:textAllCaps="true"
                  android:textColor="@android:color/white"
                  android:textSize="25sp"
                  android:textStyle="bold" />

          </RelativeLayout>
          
          <LinearLayout
              android:layout_width="match_parent"
              android:layout_height="0dp"
              android:layout_weight="1"
              android:orientation="horizontal">

              <ImageButton
                  android:id="@+id/btn_top_left"
                  android:layout_width="0dp"
                  android:layout_height="100dp"
                  android:layout_gravity="center"
                  android:layout_weight="1"
                  android:background="@null"
                  android:elevation="46dp"
                  android:onClick="btnClick"
                  android:scaleType="fitCenter"
                  android:src="@drawable/bear"
                  android:tag="0" />

              <ImageButton
                  android:id="@+id/btn_top_right"
                  android:layout_width="0dp"
                  android:layout_height="100dp"
                  android:layout_gravity="center"
                  android:layout_weight="1"
                  android:background="@null"
                  android:elevation="46dp"
                  android:onClick="btnClick"
                  android:scaleType="fitCenter"
                  android:src="@drawable/bird"
                  android:tag="1" />
          </LinearLayout>


          <LinearLayout
              android:layout_width="match_parent"
              android:layout_height="0dp"
              android:layout_weight="1"
              android:orientation="horizontal"
              android:gravity="center">

              <ImageButton
                  android:id="@+id/btn_bottom_left"
                  android:layout_width="0dp"
                  android:layout_height="100dp"
                  android:layout_weight="1"
                  android:background="@null"
                  android:elevation="46dp"
                  android:onClick="btnClick"
                  android:scaleType="fitCenter"
                  android:src="@drawable/fish"
                  android:tag="2" />


              <ImageButton
                  android:id="@+id/btn_bottom_right"
                  android:layout_width="0dp"
                  android:layout_height="100dp"
                  android:layout_weight="1"
                  android:background="@null"
                  android:elevation="46dp"
                  android:onClick="btnClick"
                  android:scaleType="fitCenter"
                  android:src="@drawable/cat"
                  android:tag="3" />
          </LinearLayout>
          <RelativeLayout
              android:layout_width="match_parent"
              android:layout_height="0dp"
              android:layout_weight="0.3"
              android:gravity="center"
              >
              <TextView
                  android:id="@+id/message"
                  android:layout_width="wrap_content"
                  android:layout_height="wrap_content"
                  android:textAllCaps="true"
                  android:textColor="@android:color/white"
                  android:textSize="36sp"
                  android:textStyle="bold"
                  />
          </RelativeLayout>

      </LinearLayout>

      <TextView
          android:id="@+id/tv_animal_to_find"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:layout_alignParentBottom="true"
          android:layout_margin="26dp"
          android:elevation="42dp"
          android:gravity="center"
          android:text="Animal"
          android:textAllCaps="true"
          android:textColor="@android:color/white"
          android:textSize="36sp"
          android:textStyle="bold" />


  </RelativeLayout>
  ```

  add end.xml:

  ```
  <android.support.constraint.ConstraintLayout
      xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:app="http://schemas.android.com/apk/res-auto"
      xmlns:tools="http://schemas.android.com/tools"
      android:layout_width="match_parent"
      android:layout_height="match_parent"
      android:background="@drawable/bg_blue"
      >


      <ImageView
          android:id="@+id/imageView3"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_marginBottom="8dp"
          android:layout_marginEnd="8dp"
          android:layout_marginStart="8dp"
          android:layout_marginTop="8dp"
          app:layout_constraintBottom_toBottomOf="parent"
          app:layout_constraintEnd_toEndOf="parent"
          app:layout_constraintHorizontal_bias="0.504"
          app:layout_constraintStart_toStartOf="parent"
          app:layout_constraintTop_toTopOf="parent"
          app:layout_constraintVertical_bias="0.15"
          app:srcCompat="@drawable/blue_ball" />

      <TextView
          android:id="@+id/tv_success"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_marginBottom="8dp"
          android:layout_marginEnd="8dp"
          android:layout_marginStart="8dp"
          android:layout_marginTop="8dp"
          android:text="Congratulation!"
          android:fontFamily="@font/font_one"
          android:textSize="35sp"
          android:textColor="#ffffff"
          app:layout_constraintBottom_toBottomOf="@+id/imageView3"
          app:layout_constraintEnd_toEndOf="@+id/imageView3"
          app:layout_constraintStart_toStartOf="@+id/imageView3"
          app:layout_constraintTop_toTopOf="@+id/imageView3" />

      <TextView
          android:id="@+id/tv_showscore"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:layout_marginBottom="8dp"
          android:layout_marginEnd="8dp"
          android:layout_marginStart="8dp"
          android:layout_marginTop="8dp"
          android:fontFamily="@font/font_one"
          android:gravity="center"
          android:text=""
          android:textAllCaps="true"
          android:textColor="#ffffff"
          android:textSize="30sp"
          app:layout_constraintBottom_toBottomOf="parent"
          app:layout_constraintEnd_toEndOf="parent"
          app:layout_constraintHorizontal_bias="0.501"
          app:layout_constraintStart_toStartOf="parent"
          app:layout_constraintTop_toBottomOf="@+id/imageView3"
          app:layout_constraintVertical_bias="0.43" />

      <Button
          android:id="@+id/bt_goback"
          android:layout_width="217dp"
          android:layout_height="46dp"
          android:layout_marginBottom="8dp"
          android:layout_marginEnd="8dp"
          android:layout_marginStart="8dp"
          android:layout_marginTop="8dp"
          android:background="@drawable/selector"
          android:fontFamily="@font/font_one"
          android:text="Go Back"
          android:textAllCaps="true"
          android:textColor="@drawable/text_selector"
          android:textSize="35sp"
          app:layout_constraintBottom_toBottomOf="parent"
          app:layout_constraintEnd_toEndOf="parent"
          app:layout_constraintHorizontal_bias="0.503"
          app:layout_constraintStart_toStartOf="parent"
          app:layout_constraintTop_toBottomOf="@+id/tv_showscore"
          app:layout_constraintVertical_bias="0.835" />
  </android.support.constraint.ConstraintLayout>
  ```

  And in PlayActivity.java:

  ```
  public void generateImg(){
          //Get four random image to display in the app
          for (ImageButton btnView : arrayButtonViews) {
              int indexOfWhatToUse;
              while (true) {
                  indexOfWhatToUse = (int) (Math.random() * (arrayDrawableImagesIDs.length - 1));
                  Log.d(getPackageName(), "indexOfWhatToUse: " + indexOfWhatToUse);
                  if (!imageIdNotToUseAgain.contains(indexOfWhatToUse)) {
                      break;
                  }
              }

              imageIdNotToUseAgain.add(indexOfWhatToUse);
              imageIdNotToUseAgainBlackAndWhite.add(arrayDrawableImagesBalckWhiteIDs[indexOfWhatToUse]);

              btnView.setImageResource(arrayDrawableImagesIDs[indexOfWhatToUse]);
              nameOfImagesUsed.add(arrayAnimalNames[indexOfWhatToUse]);
          }
          //From the four names, choose one that the use needs to find
          indexOfTheAnimalNameToFindInImageNotUsedAgain = new Random().nextInt(3) + 0;
          animalToFind = nameOfImagesUsed.get(indexOfTheAnimalNameToFindInImageNotUsedAgain);
          tv_animal_to_find.setText(animalToFind);
      }

      public void btnClick(View view) {
          Log.d(getPackageName(), "btnClick(): " + view.getTag().toString());
          count++;
          if (animalToFind.equals(nameOfImagesUsed.get(Integer.valueOf(view.getTag().toString())))) {
              Log.d(getPackageName(), "btnClick(): " + nameOfImagesUsed.get(Integer.valueOf(view.getTag().toString())));

              //ToDo 1 : Inform the user the choice was correct
              ToastUtil toastUtil = new ToastUtil(this, R.layout.toast_center, "Well Down");
              toastUtil.show(500);
              //Todo 2 : Keep track of the score as long as the application is not closed
              score++;
              tv_score.setText("SCORE: "+score);
              //Todo 3 : Generate a new challenge (at least 7 challenges needed before ending the game)
              imageIdNotToUseAgain.clear();
              imageIdNotToUseAgainBlackAndWhite.clear();
              nameOfImagesUsed.clear();
              generateImg();
              //Todo 4 : Show a congratulating message if the user finishes all the challenges
              if(count == 10){
                  Intent intent = new Intent(PlayActivity.this,EndActivity.class);
                  intent.putExtra("score",score+"");
                  startActivity(intent);
                  finish();
              }

          } else {

              //Vibrate the phone
              vibrate();

              //Change the image into its black and white version
              ImageButton imageButton = (ImageButton) view;
           imageButton.setImageResource(imageIdNotToUseAgainBlackAndWhite.get(Integer.valueOf(view.getTag().toString())));
              //Animate the views to attract the user`s attention
              new Animations().shake(this, view);
              new Animations().shake(this, tv_animal_to_find);

          }
      }

  ```

  ​