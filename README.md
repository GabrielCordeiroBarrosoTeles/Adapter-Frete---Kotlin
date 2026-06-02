# Adapter — Frete Kotlin

## Enunciado

Uma empresa de e-commerce possui um sistema legado de cálculo de frete chamado `LegacyShipping`, com o método `calculateShipping(String cep, double weightKg)` que retorna o valor em reais.

- O sistema novo exige que todos os serviços de frete implementem a interface `ShippingService`, que define o método `getFreightCost(String zipCode, double weight)`
- O `LegacyShipping` **não pode ser alterado** (código de terceiros)

## O que implementar

| Artefato | Descrição |
|---|---|
| `ShippingService` | Interface com o método `getFreightCost(zipCode, weight)` |
| `LegacyShipping` | Classe legada com `calculateShipping(cep, weightKg)` que imprime e retorna valor simulado |
| `ShippingAdapter` | Implementa `ShippingService` e delega internamente para `LegacyShipping` |
| `Main` | Cria um `ShippingAdapter`, chama `getFreightCost()` e exibe o resultado |
