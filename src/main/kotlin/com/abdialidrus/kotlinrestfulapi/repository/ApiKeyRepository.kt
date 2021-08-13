package com.abdialidrus.kotlinrestfulapi.repository

import com.abdialidrus.kotlinrestfulapi.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}