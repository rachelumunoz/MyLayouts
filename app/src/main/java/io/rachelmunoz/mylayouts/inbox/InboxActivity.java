package io.rachelmunoz.mylayouts.inbox;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.rachelmunoz.mylayouts.R;

/**
 * Created by rachelmunoz on 11/19/17.
 */

public class InboxActivity extends AppCompatActivity {
	private RecyclerView mRecyclerView;
	private Context mContext;
	private LineItemAdapter mAdapter;
	private FloatingActionButton mFloatingActionButton;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inbox);

		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		toolbar.setTitleTextColor(getResources().getColor(R.color.white));

		setSupportActionBar(toolbar);
		getSupportActionBar().setIcon(R.drawable.ic_menu);


		mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fab) ;
//		mFloatingActionButton.setBackgroundColor(getResources().getColor(R.color.inboxRed));


		mRecyclerView = findViewById(R.id.recycler);
		mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
		mRecyclerView.addItemDecoration(new DividerItemDecoration(this,  DividerItemDecoration.VERTICAL));

		mContext = this;

		updateUI();
	}

	private void updateUI() {
		List<Integer> ints = new ArrayList<>();

		for(int i = 0; i < 15; i++){
			ints.add(i);
		}

		mAdapter = new LineItemAdapter(ints);
		mRecyclerView.setAdapter(mAdapter);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mContext = null;
	}

	private class LineItemHolder extends RecyclerView.ViewHolder {
		public LineItemHolder(LayoutInflater inflater, ViewGroup parent){
			super(inflater.inflate(R.layout.item_inbox, parent, false));
		}
	}

	private class LineItemAdapter extends RecyclerView.Adapter<LineItemHolder>{
		private List<Integer> mNums;

		public LineItemAdapter(List<Integer> nums){
			mNums = nums;
		}

		@Override
		public LineItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater layoutInflater = LayoutInflater.from(mContext);
			return new LineItemHolder(layoutInflater, parent);
		}

		@Override
		public void onBindViewHolder(LineItemHolder holder, int position) {

		}

		@Override
		public int getItemCount() {
			return mNums.size();
		}
	}
}
