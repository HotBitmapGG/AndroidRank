package com.hotbitmapgg.androidrank.ui.fragment;

import android.content.Intent;

import com.hotbitmapgg.androidrank.base.RxBaseFragment;
import com.hotbitmapgg.androidrank.ui.activity.WebActivity;
import com.hotbitmapgg.studyproject.R;
import com.hotbitmapgg.androidrank.notes.android_develop_art_explore.AndroidDevelopActivity;
import com.hotbitmapgg.androidrank.notes.effective_java.EffectiveJavaNoteActivity;
import com.hotbitmapgg.androidrank.notes.gcssloop_android_notes.GcsSloopAndroidNotesActivity;
import com.hotbitmapgg.androidrank.notes.ldtk_blog.LdtkBlogActivity;
import com.hotbitmapgg.androidrank.notes.learning_notes.LearningNotesActivity;
import com.hotbitmapgg.androidrank.notes.rxjava_operator.RxJavaOperatorActivity;

import butterknife.OnClick;

public class RxjavaAndNotesFragment extends RxBaseFragment
{

    public final static String GIT_YUAN_BLOG_URL = "http://gityuan.com/";

    public final static String GIT_YUAN_BLOG_TITLE = "GityuanBlog";

    public final static String JACKYANDROID_ANDROIDINTERVIEW_URL = "https://github.com/JackyAndroid/AndroidInterview-Q-A/blob/master/README-CN.md";

    public final static String JACKYANDROID_ANDROIDINTERVIEW_TITLE = "JackyAndroid/AndroidInterview-Q-A";


    public static RxjavaAndNotesFragment newInstance()
    {

        return new RxjavaAndNotesFragment();
    }

    @Override
    public int getLayoutId()
    {

        return R.layout.fragment_rxjava_notes;
    }

    @Override
    public void initViews()
    {

    }


    @OnClick(R.id.btn_1)
    void startRxJavaOperator()
    {

        startActivity(new Intent(getActivity(), RxJavaOperatorActivity.class));
    }

    @OnClick(R.id.btn_2)
    void startLearningNotes()
    {

        startActivity(new Intent(getActivity(), LearningNotesActivity.class));
    }


    @OnClick(R.id.btn_3)
    void startGityuanBlog()
    {

        WebActivity.start(getActivity(), GIT_YUAN_BLOG_URL, GIT_YUAN_BLOG_TITLE);
    }

    @OnClick(R.id.btn_4)
    void startGcsSloopAndroidNotes()
    {

        startActivity(new Intent(getActivity(), GcsSloopAndroidNotesActivity.class));
    }


    @OnClick(R.id.btn_5)
    void startLdtkBlog()
    {

        startActivity(new Intent(getActivity(), LdtkBlogActivity.class));
    }

    @OnClick(R.id.btn_6)
    void startAndroidDevelopArtExplore()
    {

        startActivity(new Intent(getActivity(), AndroidDevelopActivity.class));
    }

    @OnClick(R.id.btn_7)
    void startEffectiveJava()
    {

        startActivity(new Intent(getActivity(), EffectiveJavaNoteActivity.class));
    }

    @OnClick(R.id.btn_8)
    void startAndroidInterviewQA()
    {

        WebActivity.start(getActivity(), JACKYANDROID_ANDROIDINTERVIEW_URL, JACKYANDROID_ANDROIDINTERVIEW_TITLE);
    }
}
