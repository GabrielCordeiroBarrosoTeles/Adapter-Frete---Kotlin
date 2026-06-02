# Adapter Pattern — E-commerce Shipping

## O Problema

O sistema novo exige que todo serviço de frete implemente `ShippingService`, mas o sistema legado `LegacyShipping` usa uma assinatura diferente e **não pode ser alterado**.

| Sistema | Método |
|---|---|
| Novo (interface) | `getFreightCost(zipCode, weight)` |
| Legado (terceiro) | `calculateShipping(cep, weightKg)` |

## O que é o Adapter?

O **Adapter** é um padrão estrutural que permite que interfaces incompatíveis trabalhem juntas. Ele age como um tradutor entre o cliente (que conhece só a nova interface) e o serviço legado.

```
Cliente
  └── ShippingService (interface)
        └── ShippingAdapter  ──────► LegacyShipping
```

## Estrutura do Projeto

```
src/main/kotlin/
├── ShippingService.kt   # Interface que o sistema novo exige
├── LegacyShipping.kt    # Classe legada (não alterável)
├── ShippingAdapter.kt   # Adapter: implementa ShippingService, delega ao legado
└── Main.kt              # Demonstração
```

## Como Executar

```bash
./gradlew run
```

Saída esperada:
```
LegacyShipping: cep=01310-100, peso=2.5kg => R$ 8.75
Custo do frete: R$ 8.75
```

## Por que Adapter aqui?

- `LegacyShipping` é código de terceiro — **não pode mudar**
- O sistema novo depende de `ShippingService` — **não pode ser ignorado**
- `ShippingAdapter` resolve o conflito **sem violar o OCP** (Open/Closed Principle): o código existente não é tocado, apenas estendido via composição
# Adapter-Frete---Kotlin
