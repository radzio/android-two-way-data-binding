# Android Two-Way Data Binding

Easy example showing how to create TwoWay Data Binding using Android Data Binding Library.


<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools">

    <data>
        <variable
            name="viewModel"
            type="net.droidlabs.twowaydatabinding.ViewModel"/>
    </data>

    <LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    >

        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:binding="@{viewModel.someText}"/>


        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:binding="@{viewModel.someText}"
            />


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{viewModel.someText}"
            />
    </LinearLayout>
</layout>

![two_way_data_binding](https://cloud.githubusercontent.com/assets/469111/11543936/90b8da44-993f-11e5-9bf6-5b1f3809e8e0.gif)
