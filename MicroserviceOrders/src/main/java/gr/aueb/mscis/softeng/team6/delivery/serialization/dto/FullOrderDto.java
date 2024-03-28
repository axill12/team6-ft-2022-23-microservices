package gr.aueb.mscis.softeng.team6.delivery.serialization.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link gr.aueb.mscis.softeng.team6.delivery.domain.Order Order} entity.
 *
 * @since 1.0.0
 */
public record FullOrderDto(
    UUID uuid,
    Boolean confirmed,
    Boolean delivered,
    LocalDateTime orderedTime,
    LocalDateTime deliveredTime,
    Long estimatedWait,
    OrderReviewDto review,
    ClientDto client,
    Long store_id,
    Set<FullOrderProductDto> products)
    implements Serializable {}
