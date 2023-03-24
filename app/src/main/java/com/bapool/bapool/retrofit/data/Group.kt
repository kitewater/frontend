package com.bapool.bapool.retrofit.data

import retrofit2.http.Url
import java.time.LocalDateTime

data class GetResGroupListResponse(
    val restaurant_name: String,
    val groups: List<ResGroupList>,
)

data class MyGrpListModel(
    val grpId: Long,
    val resName: String = "",
    val grpName: String = "",
    val participants: Int,
    val max_people: Int,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    val lastChat: String = "",
    val notReadChat: Int,
)

data class ResGroupList(
    val group_id: Int,
    val group_name: String,
    val participants: Int,
    val max_people: Int,
    val start_date: String,
    val end_date: String,
    val menu: String,
    val hashtag: ArrayList<Int>,
    val detail: String,
    val has_block_user: Boolean,
    val rating: ArrayList<Double>,
)

data class PostMakeGrpRequest(
    val restaurant_id: Int,
    val group_name: String,
    val max_people: Int,
    val start_date: String,
    val end_date: String,
    val menu: String,
    val imgUrl: String,
    val hashtag: ArrayList<Int>,
    val detail: String,
)


data class Result(
    val group_id: Int
)

data class PostMakeGrpResponse(
    val code: Int,
    val message: String,
    val result: Result
)