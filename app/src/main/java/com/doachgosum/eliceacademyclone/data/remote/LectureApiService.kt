package com.doachgosum.eliceacademyclone.data.remote

import com.doachgosum.eliceacademyclone.data.remote.dto.LectureListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface LectureApiService {

    @GET("org/academy/lecture/list/")
    suspend fun getLectureList(
        @Query("offset") offset: Int,
        @Query("count") count: Int,
        @Query("course_id") courseId: Int
    ): LectureListResponse

}