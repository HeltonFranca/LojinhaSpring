package com.ApiSpringETE.Lojinha.services;

import com.ApiSpringETE.Lojinha.models.*;
import org.springframework.data.jpa.repository.*;
public interface ProdutosRepository extends JpaRepository<Produto,Integer> {

}
