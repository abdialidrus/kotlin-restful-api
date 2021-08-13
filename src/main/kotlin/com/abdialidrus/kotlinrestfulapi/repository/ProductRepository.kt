package com.abdialidrus.kotlinrestfulapi.repository

import com.abdialidrus.kotlinrestfulapi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String> {

}